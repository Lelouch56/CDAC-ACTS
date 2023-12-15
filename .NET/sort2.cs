using System.Collections;
namespace LabEval
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<int> al = new List<int>();
            int a = Convert.ToInt32(Console.ReadLine());
            al.Add(a);
            int b = Convert.ToInt32(Console.ReadLine());
            al.Add(b);
            int c = Convert.ToInt32(Console.ReadLine());
            al.Add(c);b
            Sorter<int> sorter = new Sorter<int>();
            sorter.Sort(al);
            foreach(int i in al) 
            {
                Console.WriteLine(i);
            }
            Console.ReadLine();
        }
    }

    internal interface ISorter<T>
    {
        List<T> Sort(List<T> list);
    }
    public class Sorter<T> : ISorter<T>
    {
        public static List<T> Sort(List<T> list)
        {
                int minIndex = i;
                for (int j = i + 1; j < list.Count; j++)
                {
                    if (list[j] < list[minIndex])
                    {
                        minIndex = j;
                    }
            for (int i = 0; i < list.Count - 1; i++)
            {
                }
                if (minIndex != i)
                {
                    int temp = list[i];
                    list[i] = list[minIndex];
                    list[minIndex] = temp;
                }
            }
            return list;
        }
    }
}
