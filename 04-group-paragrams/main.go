package main

import (
	"fmt"
	"slices"
)

func groupAnagrams(strs []string) [][]string {
	// my idea: iterar por cada palabra, crear su mapa, y luego interara comparando cantidades iguales por palabra
	// groups := make([][]string)
	// kind := make(map[rune]int)

	set := make(map[string][]int)
	for idx, str := range strs {
		r := []rune(str)
		slices.Sort(r)
		
		fmt.Printf("idx: %d , str: %s , sorted: %v\n", idx, str, string(r)
		if _, ok := set[string(r)]; ok {
			set[string(r)] = append(set[string(r)], idx)
		}
	}
	fmt.Println(set)

	//save the orderd set[abc] = idx

	// for idx, str := range strs {
	// 	set := make(map[rune]int)
	// }
	// kinda whta words have

	// append
	//group by len?

	// we collect the position

	// for idx, str := range strs {
	// 	strSlice := strings.Split(str, "")
	// 	sort.Strings(strSlice)
	// 	fmt.Println(idx, strSlice)
	// }

	return [][]string{}
}

func main() {
	ex1 := []string{"act", "pots", "tops", "cat", "stop", "hat"}
	groupAnagrams(ex1)
}
