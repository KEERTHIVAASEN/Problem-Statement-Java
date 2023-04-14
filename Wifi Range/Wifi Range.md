# Question 
### There are N rooms in a straight line in Geekland State University's hostel, you are given a binary string S of length N where S[i] = '1' represents that there is a wifi in ith room or S[i] = '0' otherwise. Each wifi has range X i.e. if there is a wifi in ith room then its range will go upto X more rooms on its left as well as right.You have to find whether students in all rooms can use wifi.

### Example 1: 
Input:
N = 3, X = 0
S = "010"
### Output:
0
Explanation: 
Wifi is only accessible in second room.

### Example 2: 
Input:
N = 5, X = 1
S = "10010"
### Output:
1

### Explanation: 
Wifi range goes in all rooms.
Your Task:
You don't need to read input or print anything. Your task is to complete the function wifiRange( ) which takes integer N, string S and integer X as input parameters and returns true if students in all rooms can use wifi or false otherwise.

Expected Time Complexity:O(N)
Expected Space Complexity:O(N)

### Constraints:
1 ≤ N ≤ 106
0 ≤ X ≤ 106




### Explain for the Code 

#### This code is an implementation of the wifiRange function that takes in an integer N, a binary string S of length N, and an integer X. The function checks whether students in all rooms can use wifi. Each wifi has a range of X rooms on its left and right sides. If a wifi is present in a room, all the rooms within its range can use wifi.Initialize an array wifiCoverage to keep track of whether each room is covered by a wifi. The size of the array is N, and initially, all its elements are false.

boolean[] wifiCoverage = new boolean[N];

#### Check if the rooms within the range of each wifi are covered. Iterate over each room i in the hostel, and if a wifi is present in that room, iterate over all the rooms within its range and mark them as covered by setting the corresponding elements in wifiCoverage to true.

for (int i = 0; i < N; i++) {
    if (S.charAt(i) == '1') {
        for (int j = Math.max(0, i - X); j <= Math.min(N - 1, i + X); j++) {
            wifiCoverage[j] = true;
        }
    }
}

#### The inner loop iterates over the range of the wifi, which is from Math.max(0, i - X) to Math.min(N - 1, i + X) inclusive. The Math.max and Math.min functions ensure that we don't go out of bounds while iterating over the range. Check if all rooms are covered by a wifi. Iterate over each room in the hostel and check if it is covered by a wifi. If any room is not covered, return false.

for (int i = 0; i < N; i++) {
    if (!wifiCoverage[i]) {
        return false;
    }
}

#### If all rooms are covered, return true.
return true;
