def bubble_sort(arr):
  n = len(arr)

  for i in range(n):
    for k in range(0, n-i-1):
      if arr[k] > arr[k+1]:
        arr[k],arr[k+1] = arr[k+1], arr[k]

if __name__ == "__main__":
  arr = [64, 34, 25, 12, 22, 11, 90]
  bubble_sort(arr)
  print ("Array ordenado: ")
  for i in range(len(arr)):
    print(arr[i])