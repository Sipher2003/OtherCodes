import { Router } from 'express';
import db from '../db.js';
import { authenticateToken } from '../middleware/auth.js';

const router = Router();
router.use(authenticateToken);

// GET /api/notes - get all notes for user
router.get('/', (req, res) => {
  try {
    const rows = db.prepare(
      'SELECT date_key, title, content, tags FROM notes WHERE user_id = ?'
    ).all(req.user.id);

    const notes = {};
    for (const row of rows) {
      notes[row.date_key] = {
        title: row.title,
        content: row.content,
        tags: JSON.parse(row.tags)
      };
    }

    res.json(notes);
  } catch (err) {
    console.error('Get notes error:', err);
    res.status(500).json({ error: 'Internal server error' });
  }
});

// PUT /api/notes/:dateKey - save/update a note for a specific date
router.put('/:dateKey', (req, res) => {
  try {
    const { dateKey } = req.params;
    const { title, content, tags } = req.body;

    db.prepare(`
      INSERT INTO notes (user_id, date_key, title, content, tags, updated_at)
      VALUES (?, ?, ?, ?, ?, CURRENT_TIMESTAMP)
      ON CONFLICT(user_id, date_key)
      DO UPDATE SET title = excluded.title, content = excluded.content, tags = excluded.tags, updated_at = CURRENT_TIMESTAMP
    `).run(req.user.id, dateKey, title || '', content || '', JSON.stringify(tags || []));

    res.json({ success: true });
  } catch (err) {
    console.error('Save note error:', err);
    res.status(500).json({ error: 'Internal server error' });
  }
});

export default router;
