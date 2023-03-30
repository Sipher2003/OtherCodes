import tkinter as tk
from turtle import width
fields = 'Last Name', 'First Name', 'Job', 'Country'


def fetch(entries):
   for entry in entries:
       field = entry[0]
       text = entry[1].get()
       print('%s: "%s"' % (field, text))


def makeform(root, fields):
   entries = []
   for field in fields:
       row = tk.Frame(root)
       lab = tk.Label(row, width=15, text=field, anchor='w')
       ent = tk.Entry(row)
       row.pack(side=tk.TOP, fill=tk.X, padx=5, pady=5)
       lab.pack(side=tk.LEFT)
       ent.pack(side=tk.RIGHT, expand=tk.YES, fill=tk.X)
       entries.append((field, ent))
   return entries


if __name__ == '__main__':
   root = tk.Tk()
   ents = makeform(root, fields)
   root.bind('<Return>', (lambda event, e=ents: fetch(e)))
   b1 = tk.Button(root, text='Show', command=(lambda e=ents: fetch(e)))
   b1.pack(side=tk.LEFT, padx=5, pady=5)
   b2 = tk.Button(root, text='Quit', command=root.quit)
   b2.pack(side=tk.LEFT, padx=5, pady=5)
   root.mainloop()
