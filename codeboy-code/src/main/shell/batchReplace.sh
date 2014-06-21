
################################################################################
# Name: batchReplace.sh
# Description:
#   按顺序做以下事情：
#   1. 查找特定类型的文件，如 .h、.cpp
#   2. 将文件内容中的文本 OLD_TEXT 替换成 NEW_TEXT
#   3. 将含 OLD_TEXT 的文件名重命名为 NEW_TEXT 
#
# Author:   Breaker <breaker.zy_AT_gmail>
# Date:     2011-10
################################################################################

# IFS 表示 for 语句中各项之间的分隔符
OLDIFS=$IFS
IFS=$'\n'  # $ 使字面量启动转义，否则 \n 为直接字面量而非 LF
SCRIPT_NAME=`basename "$0"`

# 用法
usage()
{
    echo "usage:"
    echo "  $SCRIPT_NAME OLD_TEXT NEW_TEXT"
}

if [ $# -lt 2 ];then
    usage
    exit -1
fi

# 替换前后的 文本
OLD_TEXT="$1"
NEW_TEXT="$2"

#OLD_TEXT_UPPEROLD_TEXT_UPPER=`echo$OLD_TEXT | tr'[a-z]''[A-Z]'`    # 全大写的 旧文本
#OLD_TEXT_LOWER=`echo$OLD_TEXT | tr'[A-Z]''[a-z]'`    # 全小写的 旧文本

#NEW_TEXT_UPPER=`echo$NEW_TEXT | tr'[a-z]''[A-Z]'`    # 全大写的 新文本
#NEW_TEXT_LOWER=`echo$NEW_TEXT | tr'[A-Z]''[a-z]'`    # 全小写的 新文本

echo -e 'replace text & rename file ...\n'

# 查找指定文件
#FIND_REGEX='.*(/(makefile|readme)|\.(h|hxx|hpp|c|cpp|cxx|txt|mak|rc|x(ht)?ml|html?|sln|vcproj))'
FIND_REGEX='.*(/(makefile|readme)|\.(h|hxx|hpp|c|cpp|cxx|txt|mak|rc|x(ht)?ml|html?|sln|vcproj))'
#FILES=`find -type f -regextype posix-egrep -iregex"$FIND_REGEX"`
FILES=`find *`

# 文本替换时的 字符串边界
#SED_REGEX='\(\b\|_\)'
SED_REGEX='\(\b\|[0-9_]\)'
#SED_REGEX='\(\b\|[0-9a-zA-Z_]\)'

# 重命名时的 文件名边界
#GREP_REGEX='(\b|_)'
GREP_REGEX='(\b|[0-9_])'
#GREP_REGEX='(\b|[0-9a-zA-Z_])'

# 对每个查找到的文件去做...
for EACH in $FILES
do
    # 替换文件中的文本 OLD_TEXT 为 NEW_TEXT
 echo "$EACH:finding"
    sed -i "s/$SED_REGEX$OLD_TEXT$SED_REGEX/\1$NEW_TEXT\2/g" $EACH
  #  sed -i "s/$SED_REGEX$OLD_TEXT_UPPER$SED_REGEX/\1$NEW_TEXT_UPPER\2/g"$EACH
  #  sed -i "s/$SED_REGEX$OLD_TEXT_LOWER$SED_REGEX/\1$NEW_TEXT_LOWER\2/g"$EACH
     echo "$EACH: replace: $OLD_TEXT => $NEW_TEXT"

    # 重命名含 OLD_TEXT 的文件名为 NEW_TEXT
#      OLD_FILE_0=`basename $EACH | grep -E -i "$GREP_REGEX$OLD_TEXT$GREP_REGEX"`   # 只针对文件名，不管目录部分

  #    if [ "$OLD_FILE_0"c !=""c ] ;  then
     #     DIR=`dirname $EACH`
     #     OLD_FILE="$DIR/$OLD_FILE_0"

      #    NEW_FILE_0=`echo"$OLD_FILE_0" | sed"s/$OLD_TEXT/$NEW_TEXT/gi"`
   #       NEW_FILE="$DIR/$NEW_FILE_0"

 #         mv "$OLD_FILE" "$NEW_FILE"
  #        echo "rename: $OLD_FILE => $NEW_FILE"
#      fi

 #   echo ''
done
 
# 恢复环境
IFS=$OLDIFS
