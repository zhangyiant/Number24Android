#pragma once

#include <string>

using namespace std;

namespace Number24 {
	class Number24Calculator {
	public: 
		string static calculate(int number[]);
	private:
		string static process(int a[]);
		bool static compute(int a[], int Used[], int Level, double Answer, string& ResultString);
	};

}
