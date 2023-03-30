import mysql.connector
from tkinter import *
global mylist,mydb, mycursor,entName,entAddress
mydb = mysql.connector.connect(host="localhost", user="sybca", password="password@123", database="PractDB")
mycursor = mydb.cursor()
def displayByName():
   global mycursor,mylist,entName
   query = "SELECT name,address FROM customers WHERE name = %s"
   val = (entName.get(),)
   mycursor.execute(query, val)
   mylist.delete(0, END)
   myresult = mycursor.fetchall()
   for line in myresult:
       str = ' stays at '.join(line)
       mylist.insert(END, str)
def displayByAddress():
   global mycursor, mylist, entAddress
   query = "SELECT name, address FROM customers WHERE address = %s"
   val = (entAddress.get(),)
   mycursor.execute(query, val)
   myresult = mycursor.fetchall()
   mylist.delete(0,END)
   for line in myresult:
       str = ' stays at '.join(line)
       mylist.insert(END, str)
def displayRecords():
   global mycursor
   global mylist
   mycursor.execute("SELECT name, address FROM customers")
   mylist.delete(0, END)
   myresult = mycursor.fetchall()
   for line in myresult:
       str = ' stays at '.join(line)
       mylist.insert(END, str)
myWindow = Tk()
myWindow.title("Search Customers")
myWindow.geometry('350x350')
myWindow.configure(background = "#856ff8");
Label(myWindow ,text ="Name").grid(row =0,column =0,pady=5,padx=5,ipadx=5,ipady=5)
Label(myWindow ,text ="Address").grid(row =1,column =0, pady=5,padx=5,ipadx=5,ipady=5)
entName = Entry(myWindow, width=30)
entName.grid(row =0,column = 1,pady=5,padx=5,ipadx=5,ipady=5)
entAddress = Entry(myWindow,width=30)
entAddress.grid(row = 1,column = 1,pady=5,padx=5,ipadx=5,ipady=5)
Button(myWindow ,text="Search by Name",command=displayByName).grid(row=2,column=0,pady=5,padx=5,ipadx=5,ipady=5)
Button(myWindow ,text="Search by Address",command=displayByAddress).grid(row=2,column=1,pady=5,padx=5,ipadx=5,ipady=5)
Button(myWindow ,text="Show ALL Records",command=displayRecords).grid(row=3,columnspan=2,pady=5,padx=5,ipadx=5,ipady=5)
scrollbar = Scrollbar(myWindow,orient=VERTICAL)
mylist = Listbox(myWindow, yscrollcommand=scrollbar.set)
mylist.grid(row=4,columnspan=2,sticky='nsew')
scrollbar.grid(row=4,column=2,sticky='NS')
scrollbar.config(command=mylist.yview)
myWindow.mainloop()
