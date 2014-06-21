#!/bin/bash
# usage: auto-index [dir]
# it will generate a index.html for all the files under the directory
INDEX=`ls -1 $1 | sed "s/^.*/      <li\>\<a\ href=\"&\"\>&\<\\/a\>\<\\/li\>/"`
echo "<html>
  <head><title>Index of $1</title></head>
  <body>
    <h2>Index of $1</h2>
    <hr>
    <ui>
$INDEX
    <ui>
  </body>
</html>"

##zhaoyong: this is a very good sample to study the shell
## you can run this as : sh ./auto-index.sh >> index.html
## if no dir inputted, will use curent dir, ., not "" showing im the index.html
## TODO:0 will add the index.html file auto, default will generate the file
## TODO:1 add parameter to let the user choose to select whether to include a folder
## TODO:2 add parameter to let the user choose to select include only the specila file with suffix
