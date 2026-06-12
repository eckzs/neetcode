package main

func groupAnagrams(strs []string) [][]string {
	// check is anagram
	newGroup := make([]string, 0)
	groups := make([][]string, 0)
	groupStrBySize := make(map[int]map[rune]int)
	// check by len of string
	for i := 0; i <= len(strs); i++ {
		// append new str , then next check match if donset append to its own group
		// if _, ok := groupStrBySize[len(str)]; ok {
		// 		//here the len based
		// 	}
		current, next := strs[i], strs[i+1]
		if len(strs[i]) != len(strs[i+1]) {
		}
	}

	// group
	return [][]string{}
}

// counter := make(map[rune]int8)
//
//	for i, ch := range s {
//		counter[ch]++
//		counter[rune(t[i])]--
//	}
//
//	for _, v := range counter {
//		if v != 0 {
//			return false
//		}
//	}
//
// return true
func main() {
}
