#include <iostream>
#include <iomanip>
using namespace std;

void main() {
	int num1 = 2018;
	double num2 = -100.0;
	double num3 = 123.456;
	cout << "소수점을 생략하지 않음" << endl;
	cout.setf(ios::showpoint);
	cout << "소수점을 생략하지 않은 num1 = " << num1 << endl;
	cout << "소수점을 생략하지 않은 num2 = " << num2 << endl;
	cout << "소수점을 생략하지 않은 num3 = " << num3 << endl;
	cout.setf(ios::showpos);
	cout << "num1 = " << num1 <<endl;
	cout << "num2 = " << num2 << endl;
	cout << "num3 = " << num3 << endl;
	cout << "접두어 표시" << endl;
	cout.setf(ios::showbase);
	cout << "접두어 표시 10진수 num=" << num1 << endl;
	cout << "접두어 표시 16진수 num=" << hex<<num1 << endl;
	cout << "접두어 표시 8진수 num=" << oct<<num1 << endl;
	cout.setf(ios::uppercase);
	cout << "접두어 표시 10진수 num=" <<dec<< num1 << endl;
	cout << "접두어 표시 16진수 num=" <<hex<< num2 << endl;
	cout << "접두어 표시 8진수 num=" << oct<<num3 << endl;

}