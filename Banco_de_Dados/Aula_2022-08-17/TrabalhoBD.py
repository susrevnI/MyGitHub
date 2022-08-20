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
def imprimirLista(lista):
    i = 1

    for elemento in lista:
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


# Perguntando se deseja mostrar colunas expecificas
mostrarColuna = input("Deseja mostrar colunas especificas? (s/n): ")

while mostrarColuna != 'S' and mostrarColuna != 's' and mostrarColuna != 'n' and mostrarColuna != 'N':
    mostrarColuna = input("É necessario que digite 's' ou 'n': ")


# Para mostrar colunas expecificas
if mostrarColuna == 's' or mostrarColuna == 'S':
    print("\nDigite 'Sair' para sair.")
    listaColunas = list()
    

    qualColuna = input("\nDigite o nome ou numero da coluna: ")
    qualColuna.strip()

    while True:
        if (qualColuna == "Sair" or qualColuna == "sair") and len(listaColunas) != 0:
            break
        elif (qualColuna == "Sair" or qualColuna == "sair") and len(listaColunas) == 0:
            mostrarColuna = 'n'
            break
            
        l = 1

        for elemento in colunas:
            if elemento[0] == qualColuna or qualColuna == str(l):
                listaColunas.append(elemento[0])
                sim = True
                break
            else:
                sim = False
            l += 1
            
        if not sim:
            qualColuna = input("Coluna não encontrada, digite novamente: ")
            qualColuna.strip()
        else:
            qualColuna = input("Digite o nome ou numero da proxima coluna: ")
            qualColuna.strip()


# Perguntando a coluna para realizar a busca
colunaEsc = input("\nDigite o nome ou número de uma coluna para realizar uma busca: ")

colunaEsc = colunaEsc.strip()

continuarProg = True


# Verificando se fará busca por coluna
if colunaEsc != '':
    colunaEsc = procurar(myresult, colunaEsc, "Coluna")


    # Se for realizar busca por coluna
    if colunaEsc != '':


        # Tratando colunas expecificas escolhidas
        if mostrarColuna == 's' or mostrarColuna == 'S':
            select = "select "
            k = len(listaColunas)
            o = 1
            for elemento in listaColunas:
                if k != o:
                    select += elemento + ", "
                    o += 1
                else:
                    select += elemento

        
        # Realizando e armazenando a busca com base na coluna se for escolhida
        continuar = 's'

        while True:

            if continuarProg == False:
                break

            if continuar == 's' or continuar == 'S':
                procura = input(f"\nDigite o/a '{colunaEsc}': ")
                procura = procura.strip()
        

            # Caso tenha colunas expecificas
            if (mostrarColuna == 's' or mostrarColuna == 'S') and procura != '':
                mycursor.execute(f"{select} from {tabelaEsc} where {colunaEsc} = '{procura}'")
            elif mostrarColuna == 's' or mostrarColuna == 'S':
                mycursor.execute(f"{select} from {tabelaEsc}")

            #caso não tenha colunas expecificas
            elif procura != '':
                mycursor.execute(f"select * from {tabelaEsc} where {colunaEsc} = '{procura}'")
            else:
                mycursor.execute(f"select * from {tabelaEsc}")

            myresult = mycursor.fetchall()

            if len(myresult) != 0:
                break
            else:

                # Caso não tenha resultados e o usuário não queira mais fazer a busca por coluna
                continuar = input("\nNenhum resultado encontrado. Deseja continuar a procura por coluna? (s/n): ")
                while continuar != 'S' and continuar != 's' and continuar != 'n' and continuar != 'N':
                    continuar = input("\nÉ necessario que digite 's' ou 'n': ")
                if continuar == 'n' or continuar == 'N':
                    continuarProg = input("\nDeseja continuar o programa? (s/n): ")
                    while continuarProg != 'S' and continuarProg != 's' and continuarProg != 'n' and continuarProg != 'N':
                        continuarProg = input("\n necessario que digite 's' ou 'n': ")
                    if continuarProg == 'n' or continuarProg == 'N':
                        continuarProg = False
                        break
                    procura = ''

            


if continuarProg:
    # Caso não realize busca por coluna
    if colunaEsc == '':
        mycursor.execute(f"select * from {tabelaEsc}")
        myresult = mycursor.fetchall()


    # Imprimindo os resultados na tela
    j = 1

    if len(myresult) > 500:
        input(f"\nFoi encontrado {len(myresult)} resultados. É resultado pra caral%@ vai com calma ai.")
    elif len(myresult) > 50:
        input(f"\nFoi encontrado {len(myresult)} resultados. São muitos resultados, talvez alguns resultados de sua pesquisa não apareçam na tela.")
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

print("\n\n ------- Fim do Programa -------")