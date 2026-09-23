# T018
import sys
import math


def solve():
    it = map(int, sys.stdin.read().split())
    T, L, X, Y, q = next(it), next(it), next(it), next(it), next(it)
    radius = L / 2
    angular_velocity = (2 * math.pi) / T
    results = [0] * q
    for i in range(q):
        e = next(it)
        y_position = -radius * math.sin(angular_velocity * e)
        z_position = radius - radius * math.cos(angular_velocity * e)
        horizontal_dist = math.sqrt(X**2 + (Y - y_position)**2)
        vertical_dist = z_position
        angle_rad = math.atan2(vertical_dist, horizontal_dist)
        results[i] = math.degrees(angle_rad)
    print("\n".join(map(str, results)))

if __name__ == "__main__":
    solve()

