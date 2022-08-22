import mysql.connector

mydb = mysql.connector.connect(
    host="relational.fit.cvut.cz",
    user="guest",
    password="relational",
    database="northwind"
)

mycursor = mydb.cursor()

mycursor.execute(f"SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE = 'BASE TABLE' AND TABLE_SCHEMA = 'northwind'")

myresult = mycursor.fetchall()

enumerar = 1

for elemento in myresult:
    print(f"{enumerar} - {elemento[0]}")
    enumerar += 1

tabelaEsc = input("\nDigite eo numero da tabela a fazer a procura: ")

procurar = 1

for elemento in myresult:
    if tabelaEsc == str(procurar):
        tabelaEsc = elemento[0]
        break
    procurar += 1

mycursor.execute(f"SELECT column_name FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '{tabelaEsc}' and table_schema = 'northwind';")

myresult = mycursor.fetchall()

enumerar = 1

for elemento in myresult:
    print(f"{enumerar} - {elemento[0]}")
    enumerar += 1

colunaEsc = input("\nDigite o numero da coluna a fazer a procura: ")

procurar = 1

for elemento in myresult:
    if colunaEsc == str(procurar):
        colunaEsc = elemento[0]
        break
    procurar += 1

busca = input(f"\nO que deseja procurar em '{colunaEsc}': ")

mycursor.execute(f"select * from {tabelaEsc} where {colunaEsc} = '{busca}'")

myresult = mycursor.fetchall()

for elemento in myresult:
    print(elemento)

print("\nFim!!!")