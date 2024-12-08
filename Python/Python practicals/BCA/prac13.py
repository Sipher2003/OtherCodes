import mysql.connector

from tkinter import *

from tkinter import messagebox

global mylist,mydb, mycursor,entName,entAddress

mydb = mysql.connector.connect(host="localhost", user="sybca", password="password@123")

mycursor = mydb.cursor()

mycursor.execute("CREATE DATABASE PractDB")

mycursor.execute("SHOW DATABASES")

print("The Databases listed are :")

for x in mycursor:

 print(x)


mydb = mysql.connector.connect(host="localhost", user="sybca", password="password@123", database="PractDB")

mycursor = mydb.cursor()


mycursor.execute("CREATE TABLE customers (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), address VARCHAR(255))")

sql = "INSERT INTO customers (name, address) VALUES (%s, %s)"

val = [

 ('Peter', 'Lowstreet 4'),

 ('Amy', 'Apple st 652'),

 ('Hannah', 'Mountain 21'),

 ('Michael', 'Valley 345'),

 ('Sandy', 'Ocean blvd 2'),

 ('Betty', 'Green Grass 1'),

 ('Richard', 'Sky st 331'),

 ('Susan', 'One way 98'),

 ('Vicky', 'Yellow Garden 2'),

 ('Ben', 'Park Lane 38'),

 ('William', 'Central st 954'),

 ('Chuck', 'Main Road 989'),

 ('Viola', 'Sideway 1633')

]


mycursor.executemany(sql, val)

mydb.commit()


def displayRecords():

   global mycursor

   global mylist

   mycursor.execute("SELECT name, address FROM customers")

   myresult = mycursor.fetchall()

   print("Displaying Customer Records")

   for line in myresult:

       str = ' stays at '.join(line)

       mylist.insert(END, str)

       print(str)


def insertRecord():

   global mydb,mycursor, entName, entAddress

   query = "INSERT INTO customers (name, address) VALUES (%s, %s)"

   val = (entName.get(), entAddress.get())

   mycursor.execute(query,val)

   mydb.commit

   messagebox.showinfo('Insert Record','Record inserted successfully')

   entName.delete(0,'end')

   entAddress.delete(0,'end')


myWindow = Tk()

myWindow.title("Add Record for New Customers")

myWindow.geometry('300x350')

myWindow.configure(background = "#856ff8");

Label(myWindow ,text ="Name").grid(row =0,column =0,pady=5,padx=5,ipadx=5,ipady=5)

Label(myWindow ,text ="Address").grid(row =1,column =0, pady=5,padx=5,ipadx=5,ipady=5)
entName = Entry(myWindow, width=30)
entName.grid(row =0,column = 1,pady=5,padx=5,ipadx=5,ipady=5)
entAddress = Entry(myWindow,width=30)
entAddress.grid(row = 1,column = 1,pady=5,padx=5,ipadx=5,ipady=5)

Button(myWindow ,text="Submit new record",command=insertRecord).grid(row=2,columnspan=2,pady=5,padx=5,ipadx=5,ipady=5)

Button(myWindow ,text="Show Records",command=displayRecords).grid(row=3,columnspan=2,pady=5,padx=5,ipadx=5,ipady=5)
scrollbar = Scrollbar(myWindow,orient=VERTICAL)
mylist = Listbox(myWindow, yscrollcommand=scrollbar.set)
mylist.grid(row=4,columnspan=2,sticky='nsew')
scrollbar.grid(row=4,column=2,sticky='NS')
scrollbar.config(command=mylist.yview)
myWindow.mainloop()
