using System;
using System.Collections.Generic;

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
            al.Add(c);

            Sorter<int> sorter = new Sorter<int>();
            al = sorter.Sort(al);

            foreach (int i in al)
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

    public class Sorter<T> : ISorter<T> where T : IComparable<T>
    {
        public List<T> Sort(List<T> list)
        {
            for (int i = 0; i < list.Count - 1; i++)
            {
                int minIndex = i;
                for (int j = i + 1; j < list.Count; j++)
                {
                    if (list[j].CompareTo(list[minIndex]) < 0)
                    {
                        minIndex = j;
                    }
                }

                if (minIndex != i)
                {
                    T temp = list[i];
                    list[i] = list[minIndex];
                    list[minIndex] = temp;
                }
            }
            return list;
        }
    }
}
