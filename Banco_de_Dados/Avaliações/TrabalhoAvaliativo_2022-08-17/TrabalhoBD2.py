import mysql.connector

mydb = mysql.connector.connect(
    host="relational.fit.cvut.cz",
    user="guest",
    password="relational",
    database="northwind"
)

mycursor = mydb.cursor()

def selecionar(tipoBusca, tabelaEsc):
    if tipoBusca == "tabela":
        mycursor.execute(f"SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE = 'BASE TABLE' AND TABLE_SCHEMA = 'northwind'")
    else:
        mycursor.execute(f"SELECT column_name FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '{tabelaEsc}' and table_schema = 'northwind';")
    
    myresult = mycursor.fetchall()

    enumerar = 1

    for elemento in myresult:
        print(f"{enumerar} - {elemento[0]}")
        enumerar += 1

    tabColEsc = input(f"\nDigite o numero da {tipoBusca} a fazer a procura: ")

    procurar = 1

    for elemento in myresult:
        if tabColEsc == str(procurar):
            tabColEsc = elemento[0]
            return tabColEsc
        procurar += 1


tabelaEsc = selecionar("tabela", "Vazio")

colunaEsc = selecionar("coluna", tabelaEsc)

busca = input(f"\nO que deseja procurar em '{colunaEsc}': ")

mycursor.execute(f"select * from `{tabelaEsc}` where `{colunaEsc}` like '{busca}'")

myresult = mycursor.fetchall()

for elemento in myresult:
    print(elemento)

print("\nFim!!!")