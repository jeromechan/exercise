#!/bin/bash

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
printf "%-10s %-8s %-4s\n" 姓名 性别 体重kg  
printf "%-10s %-8s %-4.2f\n" 郭靖 男 66.1234 
printf "%-10s %-8s %-4.2f\n" 杨过 男 48.6543 
printf "%-10s %-8s %-4.2f\n" 郭芙 女 47.9876 