#printf no \n
#print will genereate \n
touch temp.txt
echo 'xx' > temp.txt
awk '{ i = 1; while ( i <= 800 ) { printf i","; i++}}' temp.txt