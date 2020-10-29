#!/bin/bash

# Create path ~/f1/f2/f3/f4/f5/f6;

home_dir=$(pwd)

mkdir -p f1/f2/f3/f4/f5/f6 

# Create and fill in text file in f1 folder;

cd f1/
echo “text for file” >> text-file.txt

#  Copy it to f6 folder;

cp -r text-file.txt ./f2/f3/f4/f5/f6/copy-text-file.txt

# Navigate to Home folder;

cd $home_dir

# Find copied file and remove it;

result=$(find . -iname copy-text-file.txt -type f)
rm -rf $result
