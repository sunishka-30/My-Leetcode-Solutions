result > (Integer.MAX_VALUE / 10) means:
Suppose,
result = 214748365(9 digits)
Integer.MAX_VALUE = 2147483647(10 digits) and Integer.MAX_VALUE / 10 = 214748364(9 digits)
Here, it is clearly evident that result > Integer.MAX_VALUE / 10( i.e. 214748365 > 214748364) and if we try to add even 0(zero) in result 214748365(9 digits), the number will become 2147483650(10 digits) which is obviously greater than 2147483647(Integer.MAX_VALUE which is of 10 digits). So even before adding 0(zero) or any other digit, we return the Integer.MAX_VALUE or Integer.MIN_VALUE, according to the sign case, in order to avoid integer overflow.
​
And, result == (Integer.MAX_VALUE / 10) && digit > 7 means:
Suppose,
result = 214748364(9 digits), and
Integer.MAX_VALUE / 10 = 214748364(9 digits)
Now, if the result is equal to the Integer.MAX_VALUE / 10 (214748364 == 214748364) and the digit is greater than 7 i.e. digit > 7 and if we try to add 8(assume the digit greater than 7 to be 8) to the result, then the number will become 2147483648(10 digits), which will result in integer overflow. So, even before adding the digit which is greater than 7, we return the Integer.MAX_VALUE or Integer.MIN_VALUE, according to the sign case, to avoid integer overflow.