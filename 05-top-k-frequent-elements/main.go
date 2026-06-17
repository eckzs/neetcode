package main

import (
	"fmt"
)

// Version O(n log n) con sort.Slice:

// func topKFrequent(nums []int, k int) []int {
// 	counter := make(map[int]int)
// 	for _, num := range nums {
// 		counter[num]++
// 	}
//
// 	keys := make([]int, 0, len(counter))
// 	for num := range counter {
// 		keys = append(keys, num)
// 	}
//
// 	sort.Slice(keys, func(i, j int) bool {
// 		return counter[keys[i]] > counter[keys[j]]
// 	})
//
// 	return keys[:k]
// }

func topKFrequent(nums []int, k int) []int {
	counter := make(map[int]int)
	for _, num := range nums {
		counter[num]++
	}

	bucket := make([][]int, len(nums)+1)
	for num, freq := range counter {
		bucket[freq] = append(bucket[freq], num)
	}

	res := make([]int, 0, k)
	for freq := len(bucket) - 1; freq >= 0 && len(res) < k; freq-- {
		for _, num := range bucket[freq] {
			res = append(res, num)
			if len(res) == k {
				break
			}
		}
	}
	return res
}

func main() {
	ex1 := []int{1, 2, 2, 3, 3, 3}
	k := 2
	fmt.Println(topKFrequent(ex1, k))
}
