package leetcode.medium2;

public class FindTheStudentWillReplaceChalk {
    public static void main(String[] args) {
        FindTheStudentWillReplaceChalk f = new FindTheStudentWillReplaceChalk();
        int[] chalk = {3,4,1,2};
        int k = 25;
        System.out.println(f.chalkReplacer(chalk, k));;
    }

    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        int length = chalk.length;
        for (int num : chalk) {
            sum += num;
        }

        long redundancy = (k % sum);

        for(int i = 0; i < length; i++) {
            if(chalk[i] > redundancy)
                return i;
            redundancy -= chalk[i];
        }
        return 0;
    }
}
