FILES=$(ls *.java);
for FILE in $FILES
do
    sed -i '1 s/^/package Assignments;\n/' $FILE;
done