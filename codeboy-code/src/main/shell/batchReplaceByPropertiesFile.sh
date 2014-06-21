

#./batchReplace.sh  'dependentColumn' 'Dependent Column'

awk -F "=" '{ print "batchReplace.sh " "'"'"'" $1"'"'"'" " "  "'"'"'"$2"'"'"'" }' /home/zhaoyong/workspace_2.7/AlpineMinerInterface/src/com/alpine/miner/inter/resources/language_en.properties
