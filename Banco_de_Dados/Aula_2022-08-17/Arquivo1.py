# Criar conexão com o Banco de dados
import mysql.connector

mydb = mysql.connector.connect(
    host="relational.fit.cvut.cz",
    user="guest",
    password="relational",
    database="northwind"
)

# --------------------------------------------------------------////------------------------------------------------------------------------

# Perguntar tabela
opcaoTab = input("""
1 - Customers (Clientes)
2 - Employees (Empregados)
3 - Orders (Compras)
4 - Suppliers (Fornecedores)
5 - Products (Produtos)
6 - Shippers (Transportadoras)
Escolha uma tabela a ser consultada: """)

# localizar nomes das tabelas e colunas
if (opcaoTab == '1'):
    tabela = "Customers"
    coluna = "ContactName"
elif (opcaoTab == '2'):
    tabela = "Employees"
    coluna = "FirstName"
elif (opcaoTab == '3'):
    tabela = "Orders"
    coluna = "shipName"
elif (opcaoTab == '4'):
    tabela = "Suppliers"
    coluna = "ContactName"
elif (opcaoTab == '5'):
    tabela = "Products"
    coluna = "ProductName"
elif (opcaoTab == '6'):
    tabela = "Shippers"
    coluna = "CompanyName"

# perguntar se quer nome e verificar nome
querNome = input("Deseja procurar por nome expecifico? (s/n): ")

if (querNome == 's'):
    quer = True
    opcaoNome = input(f"Qual o nome? ({coluna}): ")
else:
    quer = False

# Criar cursor
mycursor = mydb.cursor()

# Consultar tabela
if (quer):
    mycursor.execute(f"SELECT * FROM {tabela} where {coluna} like '%{opcaoNome}%'")
else:
    mycursor.execute(f"SELECT * FROM {tabela}")

# colocar resultado da busca em uma variavel
myresult = mycursor.fetchall()

# imprimir resultados
for registro in myresult:
    print(registro)