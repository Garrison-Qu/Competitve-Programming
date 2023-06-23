import java.io.*;
import java.util.ArrayList;

public class CCC22J4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        // X: must be in the same group
        st.nextToken();
        int X = (int) st.nval;
        ArrayList<String> goodpair = new ArrayList<String>();
        for (int i = 0; i < X*2; i++) {
            st.nextToken();
            goodpair.add(st.sval);
        }

        // Y: must NOT be in the same group
        st.nextToken();
        int Y = (int) st.nval;
        ArrayList<String> badpair = new ArrayList<String>();
        for (int i = 0; i < 2 * Y; i++) {
            st.nextToken();
            badpair.add(st.sval);
        }

        // G: groups
        st.nextToken();
        int G = (int) st.nval;
        ArrayList<String> groups = new ArrayList<String>();
        for (int i = 0; i < 3 * G; i++) {
            st.nextToken();
            groups.add(st.sval);

        }

        int counter = 0;

        for (int i = 0; i < G; i++) {
            if (goodpair.indexOf(groups.get(i*3)) != -1) {
                if (goodpair.indexOf(groups.get(i*3)) % 2 == 0) {
                    if (goodpair.get(goodpair.indexOf(groups.get(i*3))+1) != groups.get(i*3+1) && goodpair.get(goodpair.indexOf(groups.get(i*3))+1) != groups.get(i*3+2)) {
                        counter++;
                    }
                } else {
                    if (goodpair.get(goodpair.indexOf(groups.get(i*3))-1) != groups.get(i*3+1) && goodpair.get(goodpair.indexOf(groups.get(i*3))-1) != groups.get(i*3+2)) {
                        counter++;
                    }
                }
            }
            if (goodpair.indexOf(groups.get(i*3+1)) != -1) {
                if (goodpair.indexOf(groups.get(i*3+1)) % 2 == 0) {
                    if (goodpair.get(goodpair.indexOf(groups.get(i*3+1))+1) != groups.get(i*3+1) && goodpair.get(goodpair.indexOf(groups.get(i*3+1))+1) != groups.get(i*3-1)) {
                        counter++;
                    }
                } else {
                    if (goodpair.get(goodpair.indexOf(groups.get(i*3+1))-1) != groups.get(i*3+1) && goodpair.get(goodpair.indexOf(groups.get(i*3+1))-1) != groups.get(i*3-1)) {
                        counter++;
                    }
                }
            }
            if (goodpair.indexOf(groups.get(i*3+2)) != -1) {
                if (goodpair.indexOf(groups.get(i*3+2)) % 2 == 0) {
                    if (goodpair.get(goodpair.indexOf(groups.get(i*3+1))+1) != groups.get(i*3) && goodpair.get(goodpair.indexOf(groups.get(i*3+1))+1) != groups.get(i*3+1)) {
                        System.out.println(goodpair.get(goodpair.indexOf(groups.get(i*3+2))+1));
                        System.out.println(groups.get(i*3+1));
                        System.out.println(goodpair.get(goodpair.indexOf(groups.get(i*3+2))+1));
                        System.out.println(groups.get(i*3+1));
                        counter++;
                    }
                } else {
                    if (goodpair.get(goodpair.indexOf(groups.get(i*3+2))-1) != groups.get(i*3-1) && goodpair.get(goodpair.indexOf(groups.get(i*3+2))-1) != groups.get(i*3-2)) {
                        counter++;
                    }
                }
            }
            if (badpair.indexOf(groups.get(i*3)) != -1) {
                if (badpair.indexOf(groups.get(i*3)) % 2 == 0) {
                    if (badpair.get(badpair.indexOf(groups.get(i*3))+1) == groups.get(i*3+1) && badpair.get(badpair.indexOf(groups.get(i*3))+1) == groups.get(i*3+2)) {
                        counter++;
                    }
                } else {
                    if (badpair.get(badpair.indexOf(groups.get(i*3))-1) == groups.get(i*3+1) && badpair.get(badpair.indexOf(groups.get(i*3))-1) == groups.get(i*3+2)) {
                        counter++;
                    }
                }
            }
            if (badpair.indexOf(groups.get(i*3+1)) != -1) {
                if (badpair.indexOf(groups.get(i*3+1)) % 2 == 0) {
                    if (badpair.get(badpair.indexOf(groups.get(i*3+1))+1) == groups.get(i*3+1) && badpair.get(badpair.indexOf(groups.get(i*3+1))+1) == groups.get(i*3-1)) {
                        counter++;
                    }
                } else {
                    if (badpair.get(badpair.indexOf(groups.get(i*3+1))-1) == groups.get(i*3+1) && badpair.get(badpair.indexOf(groups.get(i*3+1))-1) == groups.get(i*3-1)) {
                        counter++;
                    }
                }
            }
            if (badpair.indexOf(groups.get(i*3+2)) != -1) {
                if (badpair.indexOf(groups.get(i*3+2)) % 2 == 0) {
                    if (badpair.get(badpair.indexOf(groups.get(i*3+2))+1) == groups.get(i*3-1) && badpair.get(badpair.indexOf(groups.get(i*3+2))+1) == groups.get(i*3-2)) {
                        counter++;
                    }
                } else {
                    if (badpair.get(badpair.indexOf(groups.get(i*3+2))-1) == groups.get(i*3-1) && badpair.get(badpair.indexOf(groups.get(i*3+2))-1) == groups.get(i*3-2)) {
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter/2);
    }
}