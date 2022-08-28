import mysql.connector

mydb = mysql.connector.connect(
    host="relational.fit.cvut.cz",
    user="guest",
    password="relational",
    database="northwind"
)

mycursor = mydb.cursor()

mycursor.execute("SELECT * FROM Customers")

myresult = mycursor.fetchall()

for registro in myresult:
    print(registro)