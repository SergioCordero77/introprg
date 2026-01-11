#! /bin/bash

echo "Aquest script recupera el repositori introprg corrupte"
echo "Si és això el que vols fer, escriu exactament 'sí'. Qualsevol cosa altrament"
read line
if [[ ! "$line" == "sí" ]];
then
	echo "No es realitza cap canvi"
	exit 0
fi

# Comprova que existeix el directori
INTROPRGDIR=$HOME/introprg
if [ ! -d "$INTROPRGDIR" ];
then
	echo "ERROR: no es troba el directori $INTROPRGDIR"
	exit 1
fi

# Obté l'adreça remota
cd "$INTROPRGDIR"
URL=$(git remote get-url --push origin)
if [[ ! "$URL" =~ ^git.+git$ ]];
then
	echo "ERROR: no es pot determinar la url remota per origin"
	exit 2
fi

# Reanomena l'antic introprg/
INTROPRGDIROLD="$HOME/tmp/introprg_$(date +'%Y%m%d%H%M%s')"
mkdir -p "$HOME/tmp"

mv -i $INTROPRGDIR $INTROPRGDIROLD
cd "$HOME"
if git clone "$URL" introprg;
then
   echo
   echo
   echo "Repositori corrupte: $INTROPRGDIROLD"
   echo "Nou repositori     : $INTROPRGDIR"
   echo
   # Recupera possibles .jar
   echo "Recuperant biblioteques"
   cp -v --update=none $INTROPRGDIROLD/.introprg/*.jar $INTROPRGDIR/.introprg/ 2> /dev/null
   # Mostra les diferències
   echo "Comparant directoris"
   diff -q $INTROPRGDIR $INTROPRGDIROLD
   echo "El llistat anterior t'indica les diferències que s'han trobat entre el que tenies"
   echo "en el repositori corrupte i el que hi ha al remot"
   echo "Revisa-ho amb atenció i, en cas de dubtes, parla amb el teu docent"
else
    # Recupera el repositori corrupte
    mv -i $INTROPRGDIROLD $INTROPRGDIR
    echo "ERROR: no ha estat possible clonar el teu repositori. Parla amb el teu docent"
fi

echo
echo "Asssegurat que executes la següent instrucció:"
echo "$ cd ~/introprg"
