# import tkinter as tk
# from tkinter import ttk
# from tkinter import messagebox
# import sqlite3


# conn=sqlite3.connect("login_db.db")

# cursor=conn.cursor()

# cursor.execute('''
# CREATE TABLE IF NOT EXISTS users
# (username TEXT,password TEXT)
# ''')

# cursor.execute("SELECT COUNT(*) FROM USERS")
# if cursor.fetchone()[0]==0:
#     cursor.execute("INSERT INTO users(username,password) VALUES (?,?)",('testuser', 'password123'))


# conn.commit()

# root=tk.Tk()
# root.title("Login Page")
# root.geometry("400x300")

# root.config(bg="#f0f0f0")

# label_title=ttk.Label(root,text="Login Page",font=("Arial",20,"bold"),anchor="center")
# label_title.grid(row=0,column=1,columnspan=2,padx=10,pady=20)

# label_title=ttk.Label(root,text="Username",font=("Arial",13,"bold"),anchor="center")
# label_title.grid(row=1,column=0,padx=10,pady=10, sticky="w")

# ent_username=ttk.Entry(root,font=("Arial",10))
# ent_username.grid(row=1,column=1,padx=10,pady=10)

# label_title=ttk.Label(root,text="password",font=("Arial",13,"bold"),anchor="center")
# label_title.grid(row=2,column=0,padx=10,pady=10,sticky="w")

# ent_password=ttk.Entry(root,font=("Arial",10))
# ent_password.grid(row=2,column=1,padx=10,pady=10)

# def chk_login():
#     username=ent_username.get()
#     password=ent_password.get()

#     cursor.execute("SELECT * FROM users WHERE username=? AND password=?",(username,password))
#     user=cursor.fetchone()

#     if user:
#         messagebox.showinfo("Login success","USer exists")
#     else:
#         messagebox.showerror("Login failed")

# login_button=ttk.Button(root,text="Login",width=20,command=chk_login)
# login_button.grid(row=3,column=1,pady=10,padx=10)

# root.mainloop()

# conn.close()




import tkinter as tk
from tkinter import ttk
import sqlite3
from tkinter import messagebox

conn=sqlite3.connect("login_db2.db")

cursor=conn.cursor()

cursor.execute('''

CREATE TABLE IF NOT EXISTS users
    (username TEXT,password TEXT)
    
''')

cursor.execute("SELECT COUNT(*) FROM users")
if cursor.fetchone()[0]==0:
    cursor.execute("INSERT INTO users (username,password) VALUES(?,?)",("testuser","password123"))
# cursor.execute("INSERT INTO users(username,password) VALUES (?,?)",('testuser', 'password123'))

conn.commit()


root=tk.Tk()
root.title("Login page")
root.geometry("300x400")

label_title=ttk.Label(root,text="Login Page",font={"arial",20,"bold"},anchor="center")
label_title.grid(row=0,column=1,columnspan=2,pady=10,padx=10)

usernamelab=ttk.Label(root,text="Username",font={"arial",12,"bold"},anchor="center")
usernamelab.grid(row=1,column=0,sticky="w")

usernameent=ttk.Entry(root,font={"arial",12,"bold"})
usernameent.grid(row=1,column=1,padx=10,pady=10)

passlab=ttk.Label(root,text="Password",font={"arial",12,"bold"},anchor="center")
passlab.grid(row=2,column=0,sticky="w")

passent=ttk.Entry(root,font={"arial",12,"bold"})
passent.grid(row=2,column=1,padx=10,pady=10)

def chklogin():
    username=usernameent.get()
    password=passent.get()

    cursor.execute("SELECT * FROM users WHERE username=? AND password=?",(username,password))
    user=cursor.fetchone()

    if user:
      messagebox.showinfo("User valid","Success")
    else:
       messagebox.showerror("not user","failure")

logbtn=ttk.Button(root,text="Login",width=20,command=chklogin)
logbtn.grid(row=3,column=1)

root.mainloop()
conn.close()