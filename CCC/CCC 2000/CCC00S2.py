import sys

river = []

def main():
    N = int(sys.stdin.readline())
    
    for i in range (N):
        river.append(float(sys.stdin.readline()))
    #for i in river:
        #sys.stdout.write(str(int(i)) + ' ')
    
    while (True):
        input = int(sys.stdin.readline())
        if input == 77:
            return 
        elif input == 99:
            next = int(sys.stdin.readline())
            perc = int(sys.stdin.readline())
            prev = river[next - 1]
            river[next - 1] = river[next - 1]*perc/100
            river.insert(next, prev * (1-perc/100))
        elif input == 88:
            next = int(sys.stdin.readline())
            river[next - 1] += river[next]
            river.pop(next)
        #for i in river:
            #sys.stdout.write(str(int(i)) + ' ')
        
if __name__ == "__main__":
    main()
    for i in river:
        sys.stdout.write(str(int(i)) + ' ')