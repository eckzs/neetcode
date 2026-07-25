package main

import (
	"slices"
	"testing"

	"github.com/stretchr/testify/assert"
)

func normalizeGroups(groups [][]string) [][]string {
	out := make([][]string, len(groups))
	for i, g := range groups {
		sorted := slices.Clone(g)
		slices.Sort(sorted)
		out[i] = sorted
	}
	slices.SortFunc(out, func(a, b []string) int {
		switch {
		case len(a) != len(b):
			return len(a) - len(b)
		default:
			for i := range a {
				if a[i] != b[i] {
					if a[i] < b[i] {
						return -1
					}
					return 1
				}
			}
			return 0
		}
	})
	return out
}

func TestGroupAnagrams(t *testing.T) {
	tests := []struct {
		name string
		strs []string
		want [][]string
	}{
		{
			name: "example 1",
			strs: []string{"act", "pots", "tops", "cat", "stop", "hat"},
			want: [][]string{{"hat"}, {"act", "cat"}, {"stop", "pots", "tops"}},
		},
		{
			name: "example 2",
			strs: []string{"x"},
			want: [][]string{{"x"}},
		},
	}

	for _, tc := range tests {
		t.Run(tc.name, func(t *testing.T) {
			got := groupAnagrams(tc.strs)
			assert.Equal(t, normalizeGroups(tc.want), normalizeGroups(got))
		})
	}
}
