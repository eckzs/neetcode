package main

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestIsAnagram(t *testing.T) {
	tests := []struct {
		name string
		s    string
		t    string
		want bool
	}{
		{
			name: "example 1",
			s:    "racecar",
			t:    "carrace",
			want: true,
		},
		{
			name: "example 2",
			s:    "jar",
			t:    "jam",
			want: false,
		},
	}

	for _, tc := range tests {
		t.Run(tc.name, func(t *testing.T) {
			got := isAnagram(tc.s, tc.t)
			assert.Equal(t, tc.want, got)
		})
	}
}
