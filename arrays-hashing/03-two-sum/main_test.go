package main

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestTwoSum(t *testing.T) {
	tests := []struct {
		name   string
		nums   []int
		target int
		want   []int
	}{
		{
			name:   "example 1",
			nums:   []int{3, 4, 5, 6},
			target: 7,
			want:   []int{0, 1},
		},
		{
			name:   "example 2",
			nums:   []int{4, 5, 6},
			target: 10,
			want:   []int{0, 2},
		},
		{
			name:   "example 3",
			nums:   []int{5, 5},
			target: 10,
			want:   []int{0, 1},
		},
	}

	for _, tc := range tests {
		t.Run(tc.name, func(t *testing.T) {
			got := twoSum(tc.nums, tc.target)
			assert.Equal(t, tc.want, got)
		})
	}
}

func BenchmarkTwoSum(b *testing.B) {
	nums := []int{1, 2, 3, 4, 5}
	for b.Loop() {
		twoSum(nums, 7)
	}
}
