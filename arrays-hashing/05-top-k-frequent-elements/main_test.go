package main

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestTopKFrequent(t *testing.T) {
	tests := []struct {
		name string
		nums []int
		k    int
		want []int
	}{
		{
			name: "example 1",
			nums: []int{1, 2, 2, 3, 3, 3},
			k:    2,
			want: []int{3, 2},
		},
		{
			name: "example 2",
			nums: []int{7, 7},
			k:    1,
			want: []int{7},
		},
	}

	for _, tc := range tests {
		t.Run(tc.name, func(t *testing.T) {
			got := topKFrequent(tc.nums, tc.k)
			assert.ElementsMatch(t, tc.want, got)
		})
	}
}
