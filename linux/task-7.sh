#!/bin/bash

# Create and execute sh file that prints current folder. NOTE: Do not use any text redactor

echo "#!/bin/bash" > test.sh
echo pwd >> test.sh
sh test.sh