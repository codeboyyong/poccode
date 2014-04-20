cd /home/zhaoyong/MyShell/db2/unl
rm *.unl
rm ../new_unl/*.unl
db2 connect to mds98_de user 'mds98' using 'mdm123456';
db2 "select 'export to ' || lower(rtrim(tabname)) || '.unl OF DEL MODIFIED BY COLDEL| nochardel MESSAGES mpi.log SELECT * FROM ' ||rtrim(tabname) || ';' from  syscat.tables where tabschema in('MDS98')" > srcdb1_export.sql ; 
 
sed '2d' srcdb1_export.sql >srcdb1_export_2.sql

db2 -tvf srcdb1_export_2.sql;
db2 connect reset;

append_string="|"
 
for f in *.unl; do 
	echo "Processing $f file.."; 
	sed "s/$/$append_string/"  $f > ../new_unl/$f;
done

rm *.unl
 
