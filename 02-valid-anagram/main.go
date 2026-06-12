package main

import "fmt"

func isAnagram(s string, t string) bool {
	if len(s) != len(t) {
		return false
	}

	counter := make(map[rune]int8)

	for i, ch := range s {
		counter[ch]++
		counter[rune(t[i])]--
	}

	for _, v := range counter {
		if v != 0 {
			return false
		}
	}

	return true
}

func main() {
	s := "racecar"
	t := "carrace"
	if isAnagram(s, t) {
		fmt.Println("OK")
	}
}
