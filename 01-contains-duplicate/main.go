package main

import "fmt"

func hasDuplicate(nums []int) bool {
	seen := make(map[int]bool)
	for _, num := range nums {
		if seen[num] {
			return true
		}
		seen[num] = true
	}
	return false
}

func main() {
	case1 := []int{1, 2, 3, 3}
	// case2 := []int{1, 2, 3, 4}
	// case3 := []int{1, 2, 3, 1, 2, 3}
	if hasDuplicate(case1) {
		fmt.Println("OK")
	} else {
		fmt.Println("!OK")
	}
}
