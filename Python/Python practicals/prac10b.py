from tkinter import *
app = Tk()
app.geometry("400x400")


def get_x_and_y(event):
   global lasx, lasy  # so that it is accessible to the other functions as well
   lasx, lasy = event.x, event.y


def draw_smth(event):
   global lasx, lasy
   canvas.create_line((lasx, lasy, event.x, event.y), fill='red', width=2)
   lasx, lasy = event.x, event.y

def erase_smth(event):
   global lasx, lasy
   canvas.create_line((lasx, lasy, event.x, event.y), fill='black', width=20)
   lasx, lasy = event.x, event.y


canvas = Canvas(app, bg='black')
canvas.pack(anchor='nw', fill='both', expand=1)
canvas.bind("<Button-1>", get_x_and_y)
canvas.bind("<B1-Motion>", draw_smth)
canvas.bind("<Button-3>", get_x_and_y)
canvas.bind("<B3-Motion>", erase_smth)
app.mainloop()

