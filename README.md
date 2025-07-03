--- Task Manager ---

The Problem:
This program tracks tasks. You can add new ones, check what’s pending, mark them as done, and look back at what you’ve finished. It uses an ArrayList for pending tasks and a regular array for completed ones. Everything gets saved to files so nothing’s lost when you close it.

 Features:
- 'ArrayList' for pending tasks
- 'String[]' array for completed tasks
- Recursive input validation
- 'try-catch' blocks for error handling
- File persistence: saves and loads from 'pending.txt' and 'completed.txt'
- Menu-driven interface

How to Run:
1. Open the repo in GitHub Codespaces
2. Run 'Main.java'.
3. Follow the on-screen prompts to manage tasks.
4. On exit, data is saved to text files in the repo.

Files:
- 'Main.java': runs the menu
- 'TaskManager.java': logic and data handling
- 'InputValidator.java': safe recursive input
- 'pending.txt': saved pending tasks
- 'completed.txt': saved completed tasks
