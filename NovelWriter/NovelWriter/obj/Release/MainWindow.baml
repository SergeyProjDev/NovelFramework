   M S B A M L   `   `   `  ���� F  BNovelWriter, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null)clr-namespace:NovelWriterNovelWriter      NovelWriter.MainWindow   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     @d2http://schemas.microsoft.com/expression/blend/2008     Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     +localclr-namespace:NovelWriter     -     � Title$  My Life Novel��$	��607��$	��808�� � WindowStartupLocation$ CenterScreen=� � 
ResizeMode$ NoResize=�.��� ����  �� ImageSource$ background.jpg�� �� Opacity$
 0.75Q�.+��� -    ��Name$ Update_DB_Btn��$��	Update DB��$
��Left=�$	��Top=�$	��100��$��50��$��5,5,0,0q�$��Yu Gothic UI)�$��14(� J� Effect 3  -System.Windows.Media.Effects.DropShadowEffect     
BlurRadius$ 9Q�   	Direction$	 311Q�	   Opacity$	 0.735Q��� -   
 ��Name$
 Choice_Number_TB��$
��Left=�$��23��$��
206,83,0,0q� �� TextWrapping$
 Wrap=�$	��Top=�$	��120��$��14(�$��0��.��   $ 20Q�$	 317Q�$
	 0.76Q�   ShadowDepth$ 6Q�.���� $��
Choice №��$
��Left=�$��
129,77,0,0q�$	��Top=�$��14(� J� RenderTransformOrigin$ 0.833,1.069&��� -    ��Name$ Music_CB��$
��Left=�$��129,115,0,0q�$	��Top=�$	��241��$��14(�   $ 20Q�$	 317Q�$
	 0.76Q�$ 6Q��� $��Music��$
��Left=�$��
78,111,0,0q�$	��Top=�$��14(��� -   $ Backgroung_CB��$
��Left=�$��129,154,0,0q�$	��Top=�$	��241��$��14(�   $ 20Q�$	 317Q�$
	 0.76Q�$ 6Q��� $��
Background��$
��Left=�$��
40,150,0,0q�$	��Top=�$��14(��� -    ��Name$ Sprite_1_CB��$��Sprite 1��$
��Left=�$��
57,217,0,0q�$	��Top=�$��14(�$��RightToLeft=��� -   $ Sprite_1��$
��Left=�$��129,213,0,0q�$	��Top=�$	��241��$��14(�   $ 20Q�$	 317Q�$
	 0.76Q�$ 6Q��� -   $ Sprite_2_CB��$��Sprite 2��$
��Left=�$��
57,252,0,0q�$	��Top=�$��14(�$��RightToLeft=��� -	   $ Sprite_2��$
��Left=�$��129,248,0,0q�$	��Top=�$	��241��$��14(�   $ 20Q�$	 317Q�$
	 0.76Q�$ 6Q��� -
   $ Sprite_3_CB��$��Sprite 3��$
��Left=�$��
57,288,0,0q�$	��Top=�$��14(�$��RightToLeft=��� -   $ Sprite_3��$
��Left=�$��129,284,0,0q�$	��Top=�$	��241��$��14(�   $ 20Q�$	 317Q�$
	 0.76Q�$ 6Q��� -   $ 	Saying_CB��$��Saying��$
��Left=�$��
88,366,0,0q�$	��Top=�$��14(�$��RightToLeft=��� -   $ Saying��$
��Left=�$��154,361,0,0q�$	��Top=�$	��182��$��14(�   $ 20Q�$	 317Q�$
	 0.76Q�$ 6Q��� -   $
 Text_Input_TB��$
��Left=�$	��101��$��
29,391,0,0q�$
 Wrap=�$	��Top=�$	��363��$��14(� �� MaxLines$ 5��.��   $ 20Q�$	 317Q�$
	 0.76Q�$ 6Q�.���� -   $ Add_Btn��$	��Add��$
��Left=�$��
88,499,0,0q�$	��Top=�$	��248��$��64��   $ 20Q�$	 317Q�$
	 0.76Q�$ 6Q��� -    ��Name$ Background_Output_Img��$
��Left=�$	��200��$��
380,10,0,0q�$	��Top=�$	��400��$
��Fill=�   $ 20Q�$	 0.695Q�$ 9Q��� -   $ Sprite_2_Output_Img��$
��Left=�$	��169��$��407,215,0,0q�$	��Top=�$	��119��   $ 20Q�$	 0.695Q�$ 9Q��� -   $ Sprite_1_Output_Img��$
��Left=�$	��169��$��531,215,0,0q�$	��Top=�$	��119��   $ 20Q�$	 0.695Q�$ 9Q��� -   $ Sprite_3_Output_Img��$
��Left=�$	��169��$��655,215,0,0q�$	��Top=�$	��119��   $ 20Q�$	 0.695Q�$ 9Q��� -   $
 Text_Output_TB��$
��Left=�$	��174��$��397,389,0,0q�$
 Wrap=�$	��Top=�$	��387�� �� 
IsReadOnly .  � ToolTip$ Double Click to clean�� � Cursor$
 Hand��" �� VerticalScrollBarVisibility$ Visible=�.��   $ 20Q�$	 317Q�$
	 0.76Q�$ 6Q�.���� -   $
 Add_Character_Name��$
��Left=�$��23��$��110,331,0,0q�$
 Wrap=�$	��Top=�$	��203�� J� 	AllowDrop .  $y�Hidden=�.��   $ 20Q�$	 0.695Q�.���� -   $ Add_Characte_btn��$��+��$
��Left=�$��23��$��313,331,0,0q�$	��Top=�$��23��$��14(�$y�Hidden=�   $ 20Q�$	 0.695Q��� -   $ Show_New_Character_Field��$��Add Cheracter >��$
��Left=�$��
10,333,0,0q�$	��Top=�$��95��   $ 20Q�$	 317Q�$
	 0.76Q�$ 6Q��� -   $��Manual��$
��Left=�$��	129,9,0,0q�$	��Top=�$	��241��$��45��$��Viner Hand ITC)�$��30(� J� OpacityMask �� $ button_scroll_clicked.png������ ���� $ button_scroll.png��