#!/bin/bash

#curShellDir=`pwd`
#currentShellFileDir=${curShellDir}
currentShellFileDir=${PWD}

# Loop structure
for file in `ls /Users/chenjinlong/Downloads/apache`; do
	echo ${file} ${#file}
	#echo `expr index "$file" c`
done

# Array
array_name=(lenth1 2 4 5)

# 取得数组元素的个数
echo ${#array_name[@]}
# 或者
echo ${#array_name[*]}
# 取得数组单个元素的长度
echo ${#array_name[0]}
# 获取数组中各个元素
my_array[0]=A;
my_array[1]=B;
my_array[2]=C;
my_array[3]=D;
echo "第一个元素为: ${my_array[0]}"
echo "第二个元素为: ${my_array[1]}"
echo "第三个元素为: ${my_array[2]}"
echo "第四个元素为: ${my_array[3]}"
# 获取数组中所有元素
echo "数组的元素为: ${my_array[*]}";
echo "数组的元素为: ${my_array[@]}";

# Pass parameter to script
echo "Shell 传递参数实例！";
echo "传递参数的个数：$#";
echo "执行的文件名：$0";
echo "第一个参数为：$1";
echo "第二个参数为：$2";
echo "第三个参数为：$3";
echo "脚本运行当前进程PID：$$";
echo "后台运行的最后一个进PID：$$";

echo "传递参数的罗列*：$*";
echo "传递参数的罗列*:"
echo "-- \$* 演示 ---"
for i in "$*"; do
	echo $i
done
echo "传递参数的罗列@：$@";
echo "传递参数的罗列@:"
echo "-- \$@ 演示 ---"
for i in "$@"; do
	echo $i
done

# expression
a=10
b=20
echo "输出运算符例子：参数一=$a,参数二=$b"

# 算术运算符
val=`expr $a + $b`
echo "a + b : $val"

val=`expr $a - $b`
echo "a - b : $val"

val=`expr $a \* $b`
echo "a * b : $val"

val=`expr $b / $a`
echo "b / a : $val"

val=`expr $b % $a`
echo "b % a : $val"

# 条件表达式要放在方括号之间，并且要有空格
if [ $a == $b ]
then
	echo "a 等于 b"
fi
if [ $a != $b ]
then
	echo "a 不等于 b"
fi

# 关系运算符
if [ $a -eq $b ]
then
	echo "$a -eq $b : a 等于 b"
else
	echo "$a -eq $b: a 不等于 b"
fi
if [ $a -ne $b ]
then
	echo "$a -ne $b: a 不等于 b"
else
	echo "$a -ne $b : a 等于 b"
fi
if [ $a -gt $b ]
then
	echo "$a -gt $b: a 大于 b"
else
	echo "$a -gt $b: a 不大于 b"
fi
if [ $a -lt $b ]
then
	echo "$a -lt $b: a 小于 b"
else
	echo "$a -lt $b: a 不小于 b"
fi
if [ $a -ge $b ]
then
	echo "$a -ge $b: a 大于或等于 b"
else
	echo "$a -ge $b: a 小于 b"
fi
if [ $a -le $b ]
then
	echo "$a -le $b: a 小于或等于 b"
else
	echo "$a -le $b: a 大于 b"
fi

# 布尔运算符
# ! 非
# -a 与运算
# -o 或运算
if [ $a != $b ]
then
	echo "$a != $b : a 不等于 b"
else
	echo "$a != $b: a 等于 b"
fi
if [ $a -lt 100 -a $b -gt 15 ]
then
	echo "$a -lt 100 -a $b -gt 15 : 返回 true"
else
	echo "$a -lt 100 -a $b -gt 15 : 返回 false"
fi
if [ $a -lt 100 -o $b -gt 100 ]
then
	echo "$a -lt 100 -o $b -gt 100 : 返回 true"
else
	echo "$a -lt 100 -o $b -gt 100 : 返回 false"
fi
if [ $a -lt 5 -o $b -gt 100 ]
then
	echo "$a -lt 100 -o $b -gt 100 : 返回 true"
else
	echo "$a -lt 100 -o $b -gt 100 : 返回 false"
fi

# 逻辑运算符（&&、||）
if [[ $a -lt 100 && $b -gt 100 ]]
then
	echo "返回 true"
else
	echo "返回 false"
fi

if [[ $a -lt 100 || $b -gt 100 ]]
then
	echo "返回 true"
else
	echo "返回 false"
fi

# 字符串运算符
a="abc"
b="efg"

if [ $a = $b ]
then
	echo "$a = $b : a 等于 b"
else
	echo "$a = $b: a 不等于 b"
fi
if [ $a != $b ]
then
	echo "$a != $b : a 不等于 b"
else
	echo "$a != $b: a 等于 b"
fi
if [ -z $a ]
then
	echo "-z $a : 字符串长度为 0"
else
	echo "-z $a : 字符串长度不为 0"
fi
if [ -n $a ]
then
	echo "-n $a : 字符串长度不为 0"
else
	echo "-n $a : 字符串长度为 0"
fi
if [ $a ]
then
	echo "$a : 字符串不为空"
else
	echo "$a : 字符串为空"
fi

# 文件/目录检查运算符
file="/var/www/runoob/test.sh"
if [ -r $file ]
then
	echo "文件可读"
else
	echo "文件不可读"
fi
if [ -w $file ]
then
	echo "文件可写"
else
	echo "文件不可写"
fi
if [ -x $file ]
then
	echo "文件可执行"
else
	echo "文件不可执行"
fi
if [ -f $file ]
then
	echo "文件为普通文件"
else
	echo "文件为特殊文件"
fi
if [ -d $file ]
then
	echo "文件是个目录"
else
	echo "文件不是个目录"
fi
if [ -s $file ]
then
	echo "文件不为空"
else
	echo "文件为空"
fi
if [ -e $file ]
then
	echo "文件存在"
else
	echo "文件不存在"
fi

# 如何从命令行中读取参数
# read name 
echo "$name It is a test"

# 显示换行
echo -e "OK! \n" # -e 开启转义
echo "It it a test"

# 显示不换行
echo -e "OK! \c" # -e 开启转义 \c 不换行
echo "It is a test"

# 输出结果到文件
# 每次执行均覆盖该文件
echo "It is a test" > override.txt
# 每次执行追加内容到该文件末尾
echo "It is a test" >> append.txt

# 原样输出字符串，不进行转义或取变量(用单引号)
echo '$name\"'

# 显示命令的执行结果
echo `date`

# 打印语句
# printf  format-string  [arguments...]
# 测试每个字符长度参数
printf "%15s %-3s" 123456 123 

printf "%-10s %-8s %-4s\n" 姓名 性别 体重kg  
printf "%10s %-8s %-4.2f\n" 郭靖 男 66.1234 
printf "%-10s %-8s %-4.2f\n" 郭靖 男 66.1234 
printf "%-10s %-8s %-4.2f\n" 杨过 男 48.6543 
printf "%-10s %-8s %-4.2f\n" 郭芙 女 47.9876 

# format-string为双引号
printf "%d %s\n" 1 "abc"

# 单引号与双引号效果一样 
printf '%d %s\n' 1 "abc" 

# 没有引号也可以输出
printf %s abcdef

# 格式只指定了一个参数，但多出的参数仍然会按照该格式输出，format-string 被重用
printf %s abc def

printf "%s\n" abc def

printf "%s %s %s\n" a b c d e f g h i j

# 如果没有 arguments，那么 %s 用NULL代替，%d 用 0 代替
printf "%s and %d \n" 

printf "niao\a"

# test命令
num1=100
num2=1001
if test $[num1] -eq $[num2]
then
	echo '两个数相等！'
else
	echo '两个数不相等！'
fi

cd /bin
if test -e ./notFile -o -e ./bash
then
	echo '有一个文件存在!'
else
	echo '两个文件都不存在'
fi

# 流程控制语句
if [ $(ps -ef | grep -c "ssh") -gt 1 ]; then echo "true"; fi

a=10
b=20
if [ $a == $b ]
then
	echo "a 等于 b"
elif [ $a -gt $b ]
then
	echo "a 大于 b"
elif [ $a -lt $b ]
then
	echo "a 小于 b"
else
	echo "没有符合的条件"
fi

num1=$[2*3]
num2=$[1+5]
if test $[num1] -eq $[num2]
then
	echo '两个数字相等!'
else
	echo '两个数字不相等!'
fi

# 循环语句
for loop in 1 2 3 4 5
do
	echo "The value is: $loop"
done

for str in 'This is a string'
do
	printf "$str\nNewLine"
done

int=1
while(( $int<=5 ))
do
	echo $int
	let "int++"
done

# 条件语句
# case的语法和C family语言差别很大，它需要一个esac（就是case反过来）作为结束标记，每个case分支用右圆括号，用两个分号表示break。
aNum=6
case $aNum in
	1)  echo '你选择了 1'
	;;
	2)  echo '你选择了 2'
	;;
	3)  echo '你选择了 3'
	;;
	4)  echo '你选择了 4'
	;;
	5|6|7)
		echo '你选择了5，6，7'
	;;
	*)  echo '你没有输入 1 到 4 之间的数字'
	;;
esac

# 函数
demoFun(){
	echo "函数返回值=0"
	echo "这是我的第一个 shell 函数!"
	# return 3
}
echo "-----函数开始执行-----"
demoFun
# 函数返回值在调用该函数后通过 $? 来获得
echo "-----函数执行完毕-----$?"

# 参数处理	说明
# $#	传递到脚本的参数个数
# $*	以一个单字符串显示所有向脚本传递的参数
# $$	脚本运行的当前进程ID号
# $!	后台运行的最后一个进程的ID号
# $@	与$*相同，但是使用时加引号，并在引号中返回每个参数。
# $-	显示Shell使用的当前选项，与set命令功能相同。
# $?	显示最后命令的退出状态。0表示没有错误，其他任何值表明有错误。
funWithParam(){
	echo "第一个参数为 $1 !"
	echo "第二个参数为 $2 !"
	echo "第十个参数为 $10 !" # 注意，$10 不能获取第十个参数，获取第十个参数需要${10}。当n>=10时，需要使用${n}来获取参数。
	echo "第十个参数为 ${10} !"
	echo "第十一个参数为 ${11} !"
	echo "参数总数有 $# 个!"
	echo "作为一个字符串输出所有参数 $* !"
}
funWithParam 1 2 3 4 5 6 7 8 9 34 73

# Here Document 是 Shell 中的一种特殊的重定向方式，用来将输入重定向到一个交互式 Shell 脚本或程序
# 将两个 delimiter 之间的内容(document) 作为输入传递给 command
# 通过 wc -l 命令计算 Here Document 的行数
wc -l << EOF
	欢迎来到
	菜鸟教程
	www.runoob.com
EOF

# 命令	说明
# command > file	将输出重定向到 file。
# command < file	将输入重定向到 file。
# command >> file	将输出以追加的方式重定向到 file。
# n > file	将文件描述符为 n 的文件重定向到 file。
# n >> file	将文件描述符为 n 的文件以追加的方式重定向到 file。
# n >& m	将输出文件 m 和 n 合并。
# n <& m	将输入文件 m 和 n 合并。
# << tag	将开始标记 tag 和结束标记 tag 之间的内容作为输入。
# 
# 0 是标准输入（STDIN），1 是标准输出（STDOUT），2 是标准错误输出（STDERR）
# /dev/null 是一个特殊的文件，写入到它的内容都会被丢弃；如果尝试从该文件读取内容，那么什么也读不到。但是 /dev/null 文件非常有用，将命令的输出重定向到它，会起到"禁止输出"的效果。
# 如果希望屏蔽 stdout 和 stderr，可以这样写：
# $ command > /dev/null 2>&1
echo 1 > /dev/null 2>&1

# 文件包含
#使用 . 号来引用common.sh 文件
echo '查看当前执行所在目录：'
curDir=`pwd`
echo ${curDir}
echo '跳转至当前shell脚本目录'
cd ${currentShellFileDir} > /dev/null 2>&1
#echo ${currentShellFileDir}

selfpath=$(cd "$(dirname "$0")"; pwd) 
echo $selfpath

# 被包含的文件 test1.sh 不需要可执行权限
. ./common.sh
# 或者使用以下包含文件代码
# source ./common.sh
echo $var1 $var2

# 获取当前脚本目录
filepath=$(cd "$(dirname "$0")"; pwd)
echo $filepath