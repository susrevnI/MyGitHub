# Criar conexão com o Banco de dados
from typing import List
import mysql.connector

mydb = mysql.connector.connect(
    host="relational.fit.cvut.cz",
    user="guest",
    password="relational",
    database="northwind"
)

# --------------------------------------------------------------////------------------------------------------------------------------------

# Criar cursor
mycursor = mydb.cursor()

# Consultar tabela
#mycursor.execute()

# colocar resultado da busca em uma variavel(lista)
#myresult = mycursor.fetchall()

# --------------------------------------------------------------////------------------------------------------------------------------------

mycursor.execute(f"SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE = 'BASE TABLE' AND TABLE_SCHEMA = 'northwind'")

myresult = mycursor.fetchall()

listaMinha = list()

i = 1

for tabela in myresult:
    print(f'{i} - {tabela[0]}')
    i += 1

tabelaEsc = input("Digite o nome de uma tabela: ")

for tabela in myresult:
    if tabelaEsc == tabela[0]:
        sim = True
        break
    else:
        sim = False

print(sim)