import { Router } from 'express';
import db from '../db.js';
import { authenticateToken } from '../middleware/auth.js';

const router = Router();
router.use(authenticateToken);

// GET /api/todos - get all todos for user
router.get('/', (req, res) => {
  try {
    const rows = db.prepare(
      'SELECT date_key, todo_id, text, completed FROM todos WHERE user_id = ? ORDER BY created_at ASC'
    ).all(req.user.id);

    const todos = {};
    for (const row of rows) {
      if (!todos[row.date_key]) todos[row.date_key] = [];
      todos[row.date_key].push({
        id: row.todo_id,
        text: row.text,
        completed: !!row.completed
      });
    }

    res.json(todos);
  } catch (err) {
    console.error('Get todos error:', err);
    res.status(500).json({ error: 'Internal server error' });
  }
});

// POST /api/todos/:dateKey - add a todo
router.post('/:dateKey', (req, res) => {
  try {
    const { dateKey } = req.params;
    const { id, text } = req.body;

    db.prepare(
      'INSERT INTO todos (user_id, date_key, todo_id, text) VALUES (?, ?, ?, ?)'
    ).run(req.user.id, dateKey, id, text);

    res.status(201).json({ success: true });
  } catch (err) {
    console.error('Add todo error:', err);
    res.status(500).json({ error: 'Internal server error' });
  }
});

// PATCH /api/todos/:todoId/toggle - toggle a todo's completed state
router.patch('/:todoId/toggle', (req, res) => {
  try {
    const { todoId } = req.params;

    db.prepare(
      'UPDATE todos SET completed = NOT completed WHERE user_id = ? AND todo_id = ?'
    ).run(req.user.id, todoId);

    res.json({ success: true });
  } catch (err) {
    console.error('Toggle todo error:', err);
    res.status(500).json({ error: 'Internal server error' });
  }
});

// DELETE /api/todos/:todoId - delete a todo
router.delete('/:todoId', (req, res) => {
  try {
    const { todoId } = req.params;

    db.prepare(
      'DELETE FROM todos WHERE user_id = ? AND todo_id = ?'
    ).run(req.user.id, todoId);

    res.json({ success: true });
  } catch (err) {
    console.error('Delete todo error:', err);
    res.status(500).json({ error: 'Internal server error' });
  }
});

export default router;
