def findMedianSortedArrays(nums1, nums2):
    merged = sorted(nums1 + nums2)
    merged_len = len(merged)

    if merged_len % 2 == 1:
        return merged[merged_len // 2]
    else:
        mid1 = merged[merged_len // 2 - 1]
        mid2 = merged[merged_len // 2]
        return (mid1 + mid2) / 2.0

nums1 = [1, 3]
nums2 = [2]
median = findMedianSortedArrays(nums1, nums2)
print(median)
