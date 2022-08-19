# Criar conexão com o Banco de dados
from fileinput import close
import mysql.connector

mydb = mysql.connector.connect(
    host="relational.fit.cvut.cz",
    user="guest",
    password="relational",
    database="northwind"
)

# --------------------------------------------------------------////------------------------------------------------------------------------

# Criar cursor
# mycursor = mydb.cursor()

# Consultar tabela
# mycursor.execute()

# colocar resultado da busca em uma variavel(lista)
# myresult = mycursor.fetchall()


# Função para procurar tabelas ou colunas
def procurar(lista, elementoEsc, tipoElemento):
    while True:
        i = 1
        for elemento in lista:
            if elementoEsc == elemento[0] or str(i) == elementoEsc:
                elementoEsc = elemento[0]
                sim = True
                break
            else:
                sim = False

            i += 1
        
        if sim:
            return elementoEsc
        else:
            elementoEsc = input(f"\n{tipoElemento} não encontrada, digite novamente: ")
            elementoEsc = elementoEsc.strip()

            if tipoElemento == "Tabela":
               while True:
                if elementoEsc == '':
                    elementoEsc = input("\nÉ necessario que digite uma tabela: ")
                    elementoEsc = elementoEsc.strip()
                else:
                    break
            elif tipoElemento == "Coluna" and elementoEsc == '':
                return ''


# Função para imprimir as buscas
def imprimirLista(myresult):
    i = 1

    for elemento in myresult:
        print(f'{i} - {elemento[0]}')
        i += 1

# --------------------------------------------------------------////------------------------------------------------------------------------

# Apresentação do programa
print(f"""
Olá,

 Esse programa faz uma busca no banco de dados NorthWind aonde você escolhe as tabelas 
 as colunas e o que procurar em determinada coluna. 
 
 Aqui vai uma breve esplicação de como o programa funciona:
 
  1 - É obrigatorio escolher uma tabela para iniciar a busca.
  2 - Caso não seja especificado uma coluna será mostrado tudo de todas as colunas.
  3 - caso não seja especificado uma consulta será mostrado tudo de todas as colunas.
  4 - Pesquisas em branco ou Enter's vazios serão tratados como escolha não especificada
        e entrara nos topicos 2 e 3.
  5 - Caso os resultado sejão muito grandes não será possivel mostrar tudo na tela de uma 
        só vez, será mostrado 50 a cada vez que precionar o botão Enter.
""")


# Crinado cursor
mycursor = mydb.cursor()


# Buscando e armazenando as tabelas
mycursor.execute(f"SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE = 'BASE TABLE' AND TABLE_SCHEMA = 'northwind'")

myresult = mycursor.fetchall()


# Buscando e escolhendo a tabela
imprimirLista(myresult)

tabelaEsc = (input("\nDigite o nome ou o número de uma tabela: "))

tabelaEsc = tabelaEsc.strip()

while True:
    if tabelaEsc == '':
        tabelaEsc = input("\nÉ necessario que digite uma tabela: ")
        tabelaEsc = tabelaEsc.strip()
    else:
        break

tabelaEsc = procurar(myresult, tabelaEsc, "Tabela")


# Buscando e armazenando as colunas
mycursor.execute(f"SELECT column_name FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '{tabelaEsc}' and table_schema = 'northwind';")

myresult = mycursor.fetchall()

colunas = myresult


# Buscando e escolhendo a coluna
print()

imprimirLista(myresult)

print()

colunaEsc = input("Digite o nome ou número de uma coluna: ")

colunaEsc = colunaEsc.strip()

if colunaEsc != '':
    colunaEsc = procurar(myresult, colunaEsc, "Coluna")

    if colunaEsc != '':
        
        # Realizando e armazenando a busca com base na coluna se for escolhida
        print()

        procura = input(f"Digite o '{colunaEsc}': ")

        procura = procura.strip()

        if procura != '':
            mycursor.execute(f"select * from {tabelaEsc} where {colunaEsc} = '{procura}'")
        else:
            mycursor.execute(f"select * from {tabelaEsc}")

        myresult = mycursor.fetchall()

if colunaEsc == '':
    mycursor.execute(f"select * from {tabelaEsc}")
    myresult = mycursor.fetchall()


# Imprimindo os resultados na tela
j = 1

if len(myresult) > 500:
    print(f"\nFoi encontrado {len(myresult)} resultados. É resultado pra caral%@ vai com calma ai.")
elif len(myresult) > 50:
    print(f"\nFoi encontrado {len(myresult)} resultados. São muitos resultados, talvez alguns resultados de sua pesquisa não apareçam na tela.")
elif len(myresult) == 0:
    print("\nNenhum resultado foi encontrado.")

for elemento in myresult:
    i = 0
    print(f"\nLinha de resutados número: {j}")
    for elemento2 in elemento:
        print(f"  {colunas[i][0]} = {elemento2}")
        i += 1
    if j % 50 == 0:
        input()
    j += 1