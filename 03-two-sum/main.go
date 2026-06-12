package main

import "fmt"

func twoSum(nums []int, target int) []int {
	positions, complement := make([]int, 0), make(map[int]int)

	for i, n := range nums {
		expected := target - n
		if idx, ok := complement[n]; ok {
			return []int{idx, i}
		}
		complement[expected] = i
	}
	return positions
}

func main() {
	input := []int{1, 2, 3, 4, 5}
	target := 7
	fmt.Println(twoSum(input, target))
}
