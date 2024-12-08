import mysql.connector
from tkinter import *
from tkinter import messagebox
global mylist,mydb, mycursor,entName,entAddress
mydb = mysql.connector.connect(host="localhost", user="sybca", password="password@123", database="PractDB")
mycursor = mydb.cursor()
def updateAddress():
   global mycursor,mylist,entAddress,entName
   query = "UPDATE customers SET address = %s WHERE name = %s"
   val = (entAddress.get(),entName.get())
   mycursor.execute(query, val)
   mylist.delete(0, END)
   mydb.commit
   messagebox.showinfo('Update Record', 'Record updated successfully')
def deleteCustomer():
   global mycursor,mylist,entName
   query = "DELETE FROM customers WHERE name = %s"
   val = (entName.get(),)
   mycursor.execute(query, val)
   mylist.delete(0, END)
   mydb.commit
   messagebox.showinfo('Delete Record', 'Record deleted successfully')
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
myWindow.title("Update and Delete Customer records")
myWindow.geometry('350x350')
myWindow.configure(background = "#856ff8");
Label(myWindow ,text ="Name").grid(row =0,column =0,pady=5,padx=5,ipadx=5,ipady=5)
Label(myWindow ,text ="New Address for Update").grid(row =1,column =0, pady=5,padx=5,ipadx=5,ipady=5)
entName = Entry(myWindow, width=30)
entName.grid(row =0,column = 1,pady=5,padx=5,ipadx=5,ipady=5)
entAddress = Entry(myWindow,width=30)
entAddress.grid(row = 1,column = 1,pady=5,padx=5,ipadx=5,ipady=5)
Button(myWindow ,text="Delete Customer",command=deleteCustomer).grid(row=2,column=0,pady=5,padx=5,ipadx=5,ipady=5)
Button(myWindow ,text="Update Address",command=updateAddress).grid(row=2,column=1,pady=5,padx=5,ipadx=5,ipady=5)
Button(myWindow ,text="Show ALL Records",command=displayRecords).grid(row=3,columnspan=2,pady=5,padx=5,ipadx=5,ipady=5)
scrollbar = Scrollbar(myWindow,orient=VERTICAL)
mylist = Listbox(myWindow, yscrollcommand=scrollbar.set)
mylist.grid(row=4,columnspan=2,sticky='nsew')
scrollbar.grid(row=4,column=2,sticky='NS')
scrollbar.config(command=mylist.yview)
myWindow.mainloop()
