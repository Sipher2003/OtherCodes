from tkinter import * 
from tkinter import messagebox 
myWindow = Tk() 
myWindow.title('FORM WINDOW') 
myWindow.geometry('250x300') 
myWindow.configure(bg='#dddddd') 
def selection(): 
    choice = var.get()     
    if choice == 1:         
        m = 'Ms.'     
    elif choice == 2: 
        m = 'Mr.'     
    elif choice == 3: 
        pass     
    return m 
def submit():     
    try: 
        name = name_Tf.get()         
        m = selection() 
        return messagebox.showinfo('FORM WINDOW', f'{m} {name}, submitted form.')     
    except Exception as ep: 
        return messagebox.showwarning('FORM WINDOW', 'Please provide valid input') 
def termsCheck():     
        if cb.get() == 1: 
         submit_btn['state'] = NORMAL     
        else: 
         submit_btn['state'] = DISABLED 
         messagebox.showerror('FORM WINDOW', 'Accept the terms & conditions') 
frame1 = Label(myWindow, bg='#dddddd') 
frame1.pack() 
frame2 = LabelFrame(frame1, text='Gender', padx=30, pady=10) 
var = IntVar() 
cb = IntVar() 
Label(frame1, text='Full Name').grid(row=0, column=0, padx=5, pady=5) 
Label(frame1, text='Email').grid(row=1, column=0, padx=5, pady=5) 
Label(frame1, text='Password').grid(row=2, column=0, padx=5, pady=5) 
Radiobutton(frame2, text='Female', variable=var,value=1, command=selection).pack() 
Radiobutton(frame2, text='Male', variable=var,value=2, command=selection).pack(anchor=W) 
Radiobutton(frame2, text='Others', variable=var,value=3, command=selection).pack() 
name_Tf = Entry(frame1) 
name_Tf.grid(row=0, column=2) 
Entry(frame1).grid(row=1, column=2) 
Entry(frame1, show="*").grid(row=2, column=2) 
frame2.grid(row=3, columnspan=3, padx=30) 
Checkbutton(frame1, text='Accept the terms & conditions', variable=cb,onvalue=1, offvalue=0, command=termsCheck).grid(row=4, columnspan=4, pady=5) 
submit_btn = Button(frame1, text="Submit", command=submit,padx=50, pady=5, state=DISABLED) 
submit_btn.grid(row=5, columnspan=4, pady=2) 
myWindow.mainloop()
