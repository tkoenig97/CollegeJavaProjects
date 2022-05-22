#include <bits/stdc++.h>
#include <stdio.h>
#include <conio.h>
#include <alloc.h>
using namespace std;

struct btreenode
{
    struct btreenode *lchild ;
    int data ;
    struct btreenode *rchild ;
} ;
void insert ( struct btreenode **, int ) ;
void inorder ( struct btreenode * ) ;
void preorder ( struct btreenode * ) ;
void postorder ( struct btreenode * ) ;
void main( )
{
    struct btreenode *bt ;
    int req, i = 1, num ;
    bt = NULL ; /* empty tree */
    clrscr( ) ;
    printf ( "Specify the number of items that needs to be inserted: " ) ;
    scanf ( "%d", &req ) ;
    while ( i++ <= req )
    {
        printf ( "Enter the data: " ) ;
        scanf ( "%d", &num ) ;
        insert ( &bt, num ) ;
    }
    printf ( "\nIn-order Traversal: " ) ;
    inorder ( bt ) ;
    printf ( "\nPre-order Traversal: " ) ;
    preorder ( bt ) ;
    printf ( "\nPost-order Traversal: " ) ;
    postorder ( bt ) ;
}
/* inserts a new node in a binary search tree */
void insert ( struct btreenode **sr, int num )
{
    if ( *sr == NULL )
    {
        *sr = malloc ( sizeof ( struct btreenode ) ) ;
        ( *sr ) -> lchild = NULL ;
        ( *sr ) -> data = num ;
        ( *sr ) -> rchild = NULL ;
        return ;
    }
    else /* search the node to which new node will be attached */
    {
/* if new data is less, traverse to left */
        if ( num < ( *sr ) -> data )
            insert ( &( ( *sr ) -> lchild ), num ) ;
        else
/* else traverse to right */
            insert ( &( ( *sr ) -> rchild ), num ) ;
    }
    return ;
}
/* traverse a binary search tree in a LDR (Left-Data-Right) fashion */
void inorder ( struct btreenode *sr )
{
    if ( sr != NULL )
    {
        inorder ( sr -> lchild ) ;
/* print the data of the node whose lchild is NULL or the path has already been traversed */
        printf ( "\t%d", sr -> data ) ;
        inorder ( sr -> rchild ) ;
    }
    else
        return ;
}
/* traverse a binary search tree in a DLR (Data-Left-right) fashion */
void preorder ( struct btreenode *sr )
{
    if ( sr != NULL )
    {
/* print the data of a node */
        printf ( "\t%d", sr -> data ) ;
/* traverse till lchild is not NULL */
        preorder ( sr -> lchild ) ;
/* traverse till rchild is not NULL */
        preorder ( sr -> rchild ) ;
    }
    else
        return ;
}
/* traverse a binary search tree in LRD (Left-Right-Data) fashion */
void postorder ( struct btreenode *sr )
{
    if ( sr != NULL )
    {
        postorder ( sr -> lchild ) ;
        postorder ( sr -> rchild ) ;
        printf ( "\t%d", sr -> data ) ;
    }
    else
        return ;
}

int sum(int freq[], int i, int j);

int optCost(int freq[], int i, int j)

{
    if (j < i)
        return 0;
    if (j == i)
        return freq[i];
    int fsum = sum(freq, i, j);
    int min = INT_MAX;
    for (int r = i; r <= j; ++r)
    {
        int cost = optCost(freq, i, r - 1) +
                   optCost(freq, r + 1, j);
        if (cost < min)
            min = cost;
    }
    return min + fsum;
}

int optimalSearchTree(int keys[],
                      int freq[], int n)
{
    return optCost(freq, 0, n - 1);
}

int sum(int freq[], int i, int j)

{
    int s = 0;
    for (int k = i; k <= j; k++)
        s += freq[k];
    return s;
}

int main()

{
    int keys[] = {1, 2, 8};
    int freq[] = {18, 20, 50};
    int n = sizeof(keys) / sizeof(keys[0]);
    cout << "Cost of Optimal BST is "
         << optimalSearchTree(keys, freq, n);
    return 0;
}