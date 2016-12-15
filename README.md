Utility sorts lines from the input file and writes output file. Launch with arguments:

<type_input_data> <type_sorting> <input_file> <output_file>;

<type_input_data> - "-s" if the input data is string; "-i" if the input data is numeric.

<type_sorting> - "-a" for ascending sorting; "-d" for descending sorting.

<input_file> - input data file.

<output_file> - output data file.

Example:

java -jar sorter.jar -s -a C:\temp\in.txt C:\temp\out.txt
