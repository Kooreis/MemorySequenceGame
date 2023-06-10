```CSharp
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading;

namespace MemorySequenceGame
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> sequence = new List<int>();
            Random random = new Random();
            int score = 0;

            while (true)
            {
                sequence.Add(random.Next(1, 5));

                foreach (var number in sequence)
                {
                    Console.WriteLine(number);
                    Thread.Sleep(1000);
                    Console.Clear();
                    Thread.Sleep(500);
                }

                foreach (var number in sequence)
                {
                    Console.Write("Enter the next number in the sequence: ");
                    int input = Convert.ToInt32(Console.ReadLine());

                    if (input != number)
                    {
                        Console.WriteLine($"Game Over! Your score was: {score}");
                        return;
                    }

                    score++;
                    Console.Clear();
                }
            }
        }
    }
}
```