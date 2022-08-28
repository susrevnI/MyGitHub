import mysql.connector

mydb = mysql.connector.connect(
    host="relational.fit.cvut.cz",
    user="guest",
    password="relational",
    database="northwind"
)

nomePais = input("Digite o nome do país a ser pesquisado: ")

mycursor = mydb.cursor()
mycursor.execute(f"SELECT * FROM Orders where shipCountry like '%{nomePais}%'")
myresult = mycursor.fetchall()

for registro in myresult:
    print(registro)