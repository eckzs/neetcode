package main

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestHasDuplicate(t *testing.T) {
	tests := []struct {
		name string
		nums []int
		want bool
	}{
		{
			name: "contains duplicate",
			nums: []int{1, 2, 3, 3},
			want: true,
		},
		{
			name: "no duplicate",
			nums: []int{1, 2, 3, 4},
			want: false,
		},
		{
			name: "multiple duplicates",
			nums: []int{1, 2, 3, 1, 2, 3},
			want: true,
		},
		{
			name: "empty slice",
			nums: []int{},
			want: false,
		},
		{
			name: "single element",
			nums: []int{5},
			want: false,
		},
	}

	for _, tc := range tests {
		t.Run(tc.name, func(t *testing.T) {
			got := hasDuplicate(tc.nums)
			assert.Equal(t, tc.want, got)
		})
	}
}
